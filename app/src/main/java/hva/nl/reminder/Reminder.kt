package hva.nl.reminder

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Reminder(
    var reminder: String
) : Parcelable
