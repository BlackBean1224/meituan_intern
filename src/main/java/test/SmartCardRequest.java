package test;
import lombok.Data;

/**
 * @author douyushan
 * @date 2020/7/27
 */
@Data
public class SmartCardRequest {
    public long userId;
    public int platformId;
    public String version;
}
