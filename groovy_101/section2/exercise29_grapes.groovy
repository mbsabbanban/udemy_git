@Grapes (
    @Grab(group='org.apache.commons', module='commons-lang3', version='3.4')
)

// Grapes annotation gets used with Grab

import org.apache.commons.lang3.text.WordUtils

String name = "Matthew Benjamin Sabban"
WordUtils wordUtils = new WordUtils()

println wordUtils.initials(name)