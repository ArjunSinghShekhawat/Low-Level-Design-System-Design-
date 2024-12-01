package structural_design_pattern.adeptor_desing_pattern;

import com.sun.security.jgss.GSSUtil;

public class HotAirBalloon {
    String gas="Helium";
    void start(String gas){
        System.out.println("Hot air balloon is start !"+gas);
    }
    public String getGas(){
        return gas;
    }
}
