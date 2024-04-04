DESCRIPTION = "hello world recipe"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRCREV = "9e7af03f9dfd48fb38d2e8eeab7700ab4e9ecadd"
PV = "1.0+git${SRCPV}"

SRC_URI = "git://github.com/abhishekg1999/hello-app;protocol=https"
S = "${WORKDIR}/git"

do_compile(){
        ${CC} hello.c ${LDFLAGS} -o hello
}

do_install(){
        install -d ${D}${bindir}
        install -m 755 hello ${D}${bindir}
}
