package UltimateJavaPart2OOP.F1Classes;

public class Browser {
    public void navigate(String address){
        String ip = findIpAddress(address, true);
        String html = sendHttpRequest(ip);
    }

    private String sendHttpRequest(String ip) {
        return "<html></html>";
    }

    private String findIpAddress(String address, boolean val) {
        return " 127.0.0.1";
    }


}
