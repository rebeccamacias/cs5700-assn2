import java.io.File

class TrackingSimulator {
    companion object {
        var shipments: MutableList<Shipment> = mutableListOf()
        fun findShipment(id: String): Shipment? {
            //return shipment whose id matches. if no match, return null
            return null;
        }
        fun addShipment(shipment: Shipment) {
            //add shipment to the list of shipments
        }
        fun runSimulation() {
            //reads the file and handles the updates to the corresponding elements
            //can be called when the app launches
            val path = System.getProperty("user.dir")
            val file = File("$path/test.txt")
            file.forEachLine { println(it) }
        }
    }
}