package com.google.chip.chiptool.setuppayloadscanner

import android.os.Parcelable
import chip.onboardingpayload.OptionalQRCodeInfoType
import kotlinx.parcelize.Parcelize

@Parcelize 
data class QrCodeInfo(
    val tag: Int,
    val type: OptionalQRCodeInfoType,
    val data: String?,
    val intDataValue: Int
) : Parcelable
