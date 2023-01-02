require cog.inc
require cog-meson.inc
require conf/include/devupstream.inc

DEFAULT_PREFERENCE = "-1"

SRC_URI[sha256sum] = "37c5f14123b8dcf077839f6c60f0d721d2a91bb37829e796f420126e6b0d38b5"

SRC_URI_class-devupstream = "git://github.com/Igalia/cog.git;protocol=https;branch=cog-0.16"
SRCREV_class-devupstream = "d2f817c7a51a7e72dd90c3c0137f5ef135974ea7"

# Required since https://github.com/Igalia/cog/commit/48dfac2ba637e223eeea1b289526d0f51e39ab88
DEPENDS_append = " libxkbcommon"

RDEPENDS_${PN} += "wpewebkit (>= 2.36)"

