DESCRIPTION = "hello world recipe"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://main.c"
S = "${WORKDIR}"

DEPENDS += "staticlib" 

do_compile(){
        ${CC} main.c ${RECIPE_SYSROOT}${libdir}/mylib.a ${LDFLAGS} -o main
}

do_install(){
        install -d ${D}${bindir}
        install -m 755 main ${D}${bindir}
}
