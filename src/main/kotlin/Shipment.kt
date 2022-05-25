import androidx.compose.runtime.mutableStateOf

class Shipment(var status: String, var id: String, var expectedDeliveryDate: Long, var currentLocation: String) {
    var notes = mutableStateOf(mutableListOf<String>())
        private set
    var updateHistory = mutableStateOf(mutableListOf<ShippingUpdate>())
        private set

    private fun setNotes(passedInNotes: List<String>) {
        this.notes = mutableStateOf(passedInNotes.toMutableList())
    }

    private fun setUpdateHistory(passedInUpdateHistory: List<ShippingUpdate>) {
        this.updateHistory = mutableStateOf(passedInUpdateHistory.toMutableList())
    }

    fun addNote(note: String) {
        notes.value.add(note)
    }

    fun addUpdate(update: ShippingUpdate) {
        updateHistory.value.add(update)
    }
}