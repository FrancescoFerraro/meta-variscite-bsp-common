DESCRIPTION = "Vendor agnostic utilities needed specifically for Variscite HW testing."

LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

inherit packagegroup

RDEPENDS:${PN} = " \
    expect \
    iperf3 \
    iptables \
    python3-pip \
    spidev-test \
    sudo \
    var-mii \
"
