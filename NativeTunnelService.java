package com.netmonitor.pro;

/** JNI bridge to the official hev-socks5-tunnel Android library. */
public final class NativeTunnelService {
    static {
        System.loadLibrary("hev-socks5-tunnel");
    }
    private NativeTunnelService() {}
    public static native boolean TProxyStartService(String configPath, int fd);
    public static native boolean TProxyStopService();
    public static native boolean TProxyIsRunning();
    public static native long[] TProxyGetStats();
}
