DESCRIPTION = "bluetooth device init script"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit update-rc.d

INITSCRIPT_NAME = "bluetooth_init"
INITSCRIPT_PARAMS = "start 21 2 3 4 5 . stop 21 0 1 6 ."

SRC_URI = "file://bluetooth_init"

do_install() {
	install -d ${D}${sysconfdir}/init.d/
	install -m 0755 ${WORKDIR}/bluetooth_init ${D}${sysconfdir}/init.d/bluetooth_init
}
