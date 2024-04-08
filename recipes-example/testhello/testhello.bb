DESCRIPTION = "hello world recipe"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://github.com/abhishekg1999/hello-app/archive/refs/tags/v1.0.tar.gz"
SRC_URI[sha256sum] = "5895ceed599ff75895d8780243256bd2e0f0a4c0d05b54e4c383f43fe2fa5f86"

S = "${WORKDIR}/hello-app-${PV}"

do_compile(){
        ${CC} hello.c ${LDFLAGS} -o hello
}

do_install(){
        install -d ${D}${bindir}
        install -m 755 hello ${D}${bindir}
}
