DESCRIPTION = "OpenCentauri eMMC Production Image"
LICENSE = "GPL-3.0-only"

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

inherit core-image

# SquashFS only -- must fit in ~128 MB rootfsA/B eMMC partition
IMAGE_FSTYPES = "squashfs"

IMAGE_FEATURES += "\
    ssh-server-dropbear \
    package-management \
"

CORE_IMAGE_EXTRA_INSTALL += "\
    packagegroup-opencentauri \
"
