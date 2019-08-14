import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.security.*;

public class RSAdemo2 {


    public static void main(String[] args) throws Exception {
        Map<String, String> keyMap = RSAUtils.genKey();
        String publicKey = keyMap.get(RSAUtils.PUBLIC_KEY);
        String privateKey = keyMap.get(RSAUtils.PRIVATE_KEY);
        System.out.println("publicKey: " + publicKey);
        System.out.println("privateKey: " + privateKey);
        Map<String,String> params = new HashMap<>();
        params.put("name","liping");
        params.put("sex","man");
        String preSign = RSAUtils.paraFilter(params);
        System.out.println("预签名数据 : "+ preSign);
        String signString = RSAUtils.sign(privateKey,preSign);
        System.out.println("SHA256withRSA签名后-----》" + signString);
        params.put("sign",signString);
        String verifySing = RSAUtils.paraFilter(params);
        System.out.println("预验证签名数据 : "+ preSign);
        boolean flag = RSAUtils.verifySing(publicKey,verifySing,signString);
        System.out.println("验证结果: " + flag);

    }

}
