package recycle.android.svape.mueblecitos.model.data

import recycle.android.svape.mueblecitos.model.Furniture

class Datasource {


    fun loadFurniture(): MutableList<Furniture>{
        var Furniture: MutableList<Furniture> = mutableListOf()

        Furniture.add(Furniture("https://enrique213-vp.github.io/RenoVar/assets/img/gallery/kitchenRoom/kitchenRoomEight.jpg"))
        Furniture.add(Furniture("https://enrique213-vp.github.io/RenoVar/assets/img/gallery/doors/doorFive.jpg"))
        Furniture.add(Furniture("https://enrique213-vp.github.io/RenoVar/assets/img/gallery/wardrobe/wardRobeThree.jpg"))
        Furniture.add(Furniture("https://enrique213-vp.github.io/RenoVar/assets/img/gallery/couch/couchFour.jpg"))
        Furniture.add(Furniture("https://enrique213-vp.github.io/RenoVar/assets/img/gallery/wardrobe/closetSix.jpg"))
        Furniture.add(Furniture("https://enrique213-vp.github.io/RenoVar/assets/img/gallery/Beds/bedFour.jpg"))

        return Furniture

    }
}