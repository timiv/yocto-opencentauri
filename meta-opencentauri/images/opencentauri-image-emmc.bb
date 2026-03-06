DESCRIPTION = "OpenCentauri eMMC production image (squashfs for A/B update)"
LICENSE = "GPL-3.0-only"

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

inherit core-image

# SquashFS output -- must fit in ~128 MB rootfsA/B partition
IMAGE_FSTYPES = "squashfs"

IMAGE_FEATURES += "\
    ssh-server-dropbear \
    package-management \
"

CORE_IMAGE_EXTRA_INSTALL += "\
    packagegroup-opencentauri \
"
