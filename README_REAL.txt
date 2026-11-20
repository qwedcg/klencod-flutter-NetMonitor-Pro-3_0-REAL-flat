NetMonitor Pro 3.0 — Real VPN capture

This version uses Android VpnService plus the official hev-socks5-tunnel engine. The GitHub Actions workflow downloads hev-socks5-tunnel 2.17.0, builds its Android JNI shared library for all common ABIs, and packages it into the APK.

The Java service runs a local SOCKS5 relay and calls VpnService.protect() on outbound sockets to avoid VPN loops. TCP destinations are recorded when a SOCKS CONNECT is created; UDP destinations are recorded from SOCKS UDP relay datagrams.

App selection: Android's per-app VPN allow-list is used. When one app is selected, records show its label. With multiple apps, records show the number of selected apps because the TUN packet itself does not directly contain the originating package name.

Build: upload these flat files to the repository root, then Actions -> Build NetMonitor Pro APK -> Run workflow. The workflow installs Android SDK/NDK, downloads hev-socks5-tunnel 2.17.0, builds the native library, then assembles the APK.
