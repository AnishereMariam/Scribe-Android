package be.scri.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tablename="clips", indices=[(Index(value=["id"], unique=true))])
data class Clip(
    @PrimaryKey(autoGenerate = true) var id: Long?,
    @ColumnInfo(name="value") var value: String,
) : ListItem()
