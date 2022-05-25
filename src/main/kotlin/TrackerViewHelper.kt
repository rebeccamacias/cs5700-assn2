import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class TrackerViewHelper : Observer {
    var result by mutableStateOf("")
    var userInput by mutableStateOf("")
    private val shipmentStrategies = mapOf<String, ShipmentStrategy>(
        Pair("created", CreatedStrategy()),
        Pair("delivered", DeliveredStrategy()),
        Pair("cancelled", CancelledStrategy()),
        Pair("shipped", ShippedStrategy()),
        Pair("lost", LostStrategy()),
        Pair("delayed", DelayedStrategy()),
        Pair("location", LocationStrategy()),
        Pair("noteAdded", NoteAddedStrategy()),
    )

    fun trackShipment(id: String) {
        //return status, location, date & time expected delivery, notes,
        //updates(shipment went from {previousStatus} to {newStatus} on {timestamp})
        var foundShipment = TrackingSimulator.findShipment(id)
        if (foundShipment != null) {
            result = foundShipment.toString()
        } else {
            result = "Shipment not found"
        }
    }

    fun stopTracking() {
        //stop tracking, delete the object
    }

    override fun update() {
        TODO("Not yet implemented")
        //add a new update to the card
    }

}