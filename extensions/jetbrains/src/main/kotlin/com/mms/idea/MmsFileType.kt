package com.mms.idea

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object MmsFileType : LanguageFileType(MmsLanguage) {
    override fun getName(): String = "MMS"

    override fun getDescription(): String = "MMS (Minecraft MetaScript) file"

    override fun getDefaultExtension(): String = "mms"

    override fun getIcon(): Icon? = null // You can add an icon later
}
