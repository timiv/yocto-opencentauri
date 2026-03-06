DESCRIPTION = "OpenCentauri common packages"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS:${PN} = "\
    usbutils \
    libgpiod-tools \
    kernel-modules \
    rtw88 \
    wpa-supplicant \
    iw \
    kalico \
    kalico-firmware-dsp \
    moonraker \
    mainsail \
    opencentauri-usb-automount \
    opencentauri-zram-swap \
    nginx \
    git \
    htop \
    i2c-tools \
    nano \
    devmem2 \
    mjpg-streamer \
    swupdate \
    swupdate-www \
    libubootenv-bin \
    opencentauri-fw-env \
"
