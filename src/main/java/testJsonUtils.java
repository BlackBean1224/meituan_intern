import com.dianping.pigeon.registry.zookeeper.JsonUtils;
import com.dianping.pigeon.remoting.common.codec.json.JacksonUtils;
import test.SmartCardRequest;

import java.io.IOException;

/**
 * @author douyushan
 * @date 2020/7/27
 */

//{"@class":"com.meituan.service.ordercenter.api.rpc.SmartCardRequest","userId":1,"platformId":0,"version":"11.0.200"}
public class testJsonUtils {
    public static void main(String[] args) throws IOException {
        SmartCardRequest request = new SmartCardRequest();
        request.setPlatformId(0);
        request.setUserId(1L);
        request.setVersion("11.0.200");
        System.out.println(JacksonUtils.serialize(request));
    }
}
