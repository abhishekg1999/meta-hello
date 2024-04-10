DESCRIPTION = "hello world recipe"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://github.com/abhishekg1999/staticlib/archive/refs/tags/v1.0.tar.gz"
SRC_URI[sha256sum] = "4665eb2e17870832367e3d02353b59cd1d5585e776c2c8ee2aba7a612a0b9e61"

S = "${WORKDIR}/staticlib-1.0"

do_compile(){
        ${MAKE}
}

do_install(){
        install -d ${D}${libdir}
        install -m 755 ${S}/mylib.a ${D}${libdir}
}
