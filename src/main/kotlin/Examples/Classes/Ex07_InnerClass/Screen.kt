package Examples.Classes.Ex07_InnerClass

class Screen {
    fun refresh(){

    }

    inner class ClickListenner {
        fun onClick(){
            this@Screen.refresh() // ссылка на внешний класс
        }
    }
}