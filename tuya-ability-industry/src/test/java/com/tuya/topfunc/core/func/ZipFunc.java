package com.tuya.topfunc.core.func;

import lombok.Cleanup;
import lombok.SneakyThrows;
import org.springframework.util.FileCopyUtils;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.function.BiConsumer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public interface ZipFunc extends ObjectFunc {
    @SneakyThrows
    default void zip(InputStream input, OutputStream output, String entryName) {
        @Cleanup ZipOutputStream zos = new ZipOutputStream(output);
        zos.putNextEntry(new ZipEntry(entryName));
        FileCopyUtils.copy(input, zos);
        zos.closeEntry();
    }

    @SneakyThrows
    default void unZip(InputStream input, BiConsumer<String, ZipInputStream> consumer) {
        @Cleanup ZipInputStream zis = new ZipInputStream(input);
        ZipEntry entry = zis.getNextEntry();
        consumer.accept(entry.getName(), zis);
        zis.closeEntry();
    }
}
