SUMMARY = "Init script to mount writable overlays for printer apps"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-3.0-only;md5=c79ff39f19dfec6d293b95dea7b07891"

SRC_URI = "file://overlayfs-apps-init-d"

S = "${WORKDIR}"

inherit update-rc.d allarch

INITSCRIPT_NAME = "overlayfs-apps"
INITSCRIPT_PARAMS = "start 98 S . stop 02 6 ."

do_install() {
    install -d ${D}${sysconfdir}/init.d
    install -m 0755 ${WORKDIR}/overlayfs-apps-init-d ${D}${sysconfdir}/init.d/overlayfs-apps
}

FILES:${PN} = "${sysconfdir}/init.d/overlayfs-apps"
