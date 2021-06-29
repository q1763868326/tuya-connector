//package com.tuya.connector.open.api.header;
//
//import com.tuya.connector.api.config.ApiDataSource;
//import com.tuya.connector.api.config.Configuration;
//import com.tuya.connector.api.model.HttpRequest;
//import com.tuya.connector.open.api.token.TuyaToken;
//import com.tuya.connector.open.api.token.TuyaTokenManager;
//import lombok.extern.slf4j.Slf4j;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.condition.EnabledIf;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
///**
// * @author benguan.zhou@tuya.com
// * @description
// * @date 2021/06/25
// */
////@Disabled
//@Slf4j
//public class TuyaHeaderProcessorTest {
//    static TuyaHeaderProcessor processor;
//    /*
//    curl --request GET "https://openapi.tuyacn.com/v1.0/iot-03/idaas/spaces?space_code=def&space_group=abc" --header "sign_method: HMAC-SHA256" --header "client_id: f5ccfrwnaleow1n717on" --header "t: 1624947591953" --header "mode: cors" --header "Content-Type: application/json" --header "sign: 863089F3C7E6FF8FD3CC84DBBB456203B26683664390969CE2EED6F14500B9D4" --header "access_token: aad4b9022d2915d887409b43fa958e80"
//    * */
//    @BeforeAll
//    static void init(){
//        Configuration config = new Configuration();
//        ApiDataSource apiDataSource = ApiDataSource.builder()
//                .ak("f5ccfrwnaleow1n717on")
//                .sk("d2c53c63334441faa763de3efaa50038")
//                .tokenManager(new TuyaTokenManager(config) {
//                    @Override
//                    public TuyaToken getToken() {
//                        return TuyaToken.builder()
//                                .access_token("aad4b9022d2915d887409b43fa958e80").build();
//                    }
//
//                    @Override
//                    public TuyaToken refreshToken() {
//                        return TuyaToken.builder()
//                                .access_token("aad4b9022d2915d887409b43fa958e80").build();
//                    }
//
//                    @Override
//                    public Configuration getConfiguration() {
//                        return null;
//                    }
//                })
//                .build();
//        config.setApiDataSource(apiDataSource);
//        processor = new TuyaHeaderProcessor(config);
//    }
//    @Test
//    public void testSign() throws MalformedURLException {
//        Map<String,String> headers = processor.value(HttpRequest.builder()
//                .url(new URL("https://openapi.tuyacn.com/v1.0/iot-03/idaas/spaces?space_code=def&space_group=abc"))
//                .headers(zip(Arrays.asList("client_id","t","access_token","nonce")
//                        ,Arrays.asList("f5ccfrwnaleow1n717on","1624947591953","aad4b9022d2915d887409b43fa958e80","").stream()
//                                .map(it->Arrays.asList(it)).collect(Collectors.toList())))
//                //.body("".getBytes(StandardCharsets.UTF_8))
//                .httpMethod("get")
//                .build());
//        System.out.println(headers);
//        Assertions.assertEquals("863089F3C7E6FF8FD3CC84DBBB456203B26683664390969CE2EED6F14500B9D4",headers.get("sign"));
//    }
//
//    private <K,V> Map<K,V> zip(List<K> ks, List<V> vs){
//        Map<K,V> map = new HashMap<>();
//        Iterator<K> iterK = ks.iterator();
//        Iterator<V> iterV = vs.iterator();
//        while(iterK.hasNext()){
//            if(iterV.hasNext()){
//                map.put(iterK.next(),iterV.next());
//            }else{
//                map.put(iterK.next(),null);
//            }
//        }
//        return map;
//    }
//}
