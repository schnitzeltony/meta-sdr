require recipes-support/uhd/uhd.inc

LIC_FILES_CHKSUM = "file://LICENSE;md5=8255adf1069294c928e0e18b01a16282"

SRC_URI = "http://files.ettus.com/binaries/uhd/uhd_003.010.002.000-release/${PN}-${PV}-release.tar.gz \
           file://0001-Convert-the-asm-s16-le-converters-to-NEON-intrinsics.patch;striplevel=2 \
           file://0002-lib-Unbreak-build-against-Boost-1.67.patch;striplevel=2 \
           file://0003-examples-Remove-use-of-boost-posix_time-from-rx_asci.patch;striplevel=2 \
           file://0004-lib-Remove-some-unnecessary-use-of-boost-posix_time.patch;striplevel=2 \
           file://0005-cores-rx_vita_core_3000-Replace-boost-this_thread-sl.patch;striplevel=2 \
          "
SRC_URI[md5sum] = "b272beee2d294c58f0f0553146146013"                                                                                                                            
SRC_URI[sha256sum] = "dbb2bc42132212c59673c50a14718ad4a9c3d90cb035e836fdf08bf6fe95e33a" 

S = "${WORKDIR}/uhd_3.10.2.0-release"

EXTRA_OECMAKE_append = " -DUHD_RELEASE_MODE=release"
