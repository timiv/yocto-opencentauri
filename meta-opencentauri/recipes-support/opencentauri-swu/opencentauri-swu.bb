DESCRIPTION = "OpenCentauri OTA update image (.swu) for eMMC A/B updates"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit swupdate

# Ensure the eMMC squashfs image and boot partition are built first
IMAGE_DEPENDS = "opencentauri-image-emmc opencentauri-boot-image"

# Squashfs rootfs from DEPLOY_DIR_IMAGE
SWUPDATE_IMAGES = "opencentauri-image-emmc"
SWUPDATE_IMAGES_FSTYPES[opencentauri-image-emmc] = ".rootfs.squashfs"

# Boot partition vfat image (deployed as opencentauri-boot.vfat, no MACHINE suffix)
SWUPDATE_IMAGES += "opencentauri-boot"
SWUPDATE_IMAGES_FSTYPES[opencentauri-boot] = ".vfat"
SWUPDATE_IMAGES_NOAPPEND_MACHINE[opencentauri-boot] = "1"

SRC_URI = "file://sw-description"
