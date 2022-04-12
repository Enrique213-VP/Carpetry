package recycle.android.svape.mueblecitos.model.data


import recycle.android.svape.mueblecitos.model.Furniture

class Datasource {


    fun loadCloset(): MutableList<Furniture>{
        var closets: MutableList<Furniture> = mutableListOf()

        closets.add(Furniture("https://enrique213-vp.github.io/RenoVar/assets/img/gallery/kitchenRoom/kitchenRoomEight.jpg"))
        closets.add(Furniture("https://enrique213-vp.github.io/RenoVar/assets/img/gallery/doors/doorFive.jpg"))
        closets.add(Furniture("https://enrique213-vp.github.io/RenoVar/assets/img/gallery/wardrobe/wardRobeThree.jpg"))
        closets.add(Furniture("https://enrique213-vp.github.io/RenoVar/assets/img/gallery/couch/couchFour.jpg"))
        closets.add(Furniture("https://enrique213-vp.github.io/RenoVar/assets/img/gallery/wardrobe/closetSix.jpg"))
        closets.add(Furniture("https://enrique213-vp.github.io/RenoVar/assets/img/gallery/Beds/bedFour.jpg"))

        return closets

    }


    fun loadChairs(): MutableList<Furniture>{
        var chairs: MutableList<Furniture> = mutableListOf()

        chairs.add(Furniture("https://drive.google.com/file/d/1McmI1IgZSgMgwa0jfRap9fQkvRkjevXk/view"))
        chairs.add(Furniture("blob:https://web.whatsapp.com/09f475ae-9d09-491a-884a-f13c5aaed893"))
        chairs.add(Furniture("https://enrique213-vp.github.io/RenoVar/assets/img/gallery/chair/ChairOne.jpg"))
        chairs.add(Furniture("https://enrique213-vp.github.io/RenoVar/assets/img/gallery/Beds/bedtg.jpg"))

        return chairs

    }
}