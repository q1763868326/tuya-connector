package com.tuya.topfunc.core;

import com.tuya.topfunc.core.func.ArrayFunc;
import com.tuya.topfunc.core.func.CollectionFunc;
import com.tuya.topfunc.core.func.DateFunc;
import com.tuya.topfunc.core.func.FunctionFunc;
import com.tuya.topfunc.core.func.IOFunc;
import com.tuya.topfunc.core.func.ObjectFunc;
import com.tuya.topfunc.core.func.ReflectFunc;
import com.tuya.topfunc.core.func.TestFunc;
import com.tuya.topfunc.core.func.TextFunc;
import com.tuya.topfunc.core.func.ZipFunc;

public interface TopFunc extends ArrayFunc,
        CollectionFunc, DateFunc, FunctionFunc,
        IOFunc, ReflectFunc, TestFunc, TextFunc, ZipFunc, ObjectFunc {
}
