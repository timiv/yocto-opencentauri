DESCRIPTION = "OpenCentauri -- build all eMMC images in one target"
LICENSE = "GPL-3.0-only"

# This is a meta-recipe with no packages of its own.
# Building it triggers all deployable OpenCentauri eMMC artifacts:
#   - opencentauri-image-emmc  (squashfs rootfs for eMMC A/B partition)
#   - opencentauri-initramfs   (cpio.gz initramfs; via opencentauri-boot-image)
#   - opencentauri-boot-image  (vfat boot partition, kernel+DTB+initramfs)
#   - opencentauri-swu         (.swu update archive for A/B OTA)
#   - u-boot                   (U-Boot with SPL)

inherit nopackages

do_build[depends] = "\
    opencentauri-image-emmc:do_image_complete \
    opencentauri-boot-image:do_deploy \
    opencentauri-swu:do_swuimage \
    u-boot:do_deploy \
"
