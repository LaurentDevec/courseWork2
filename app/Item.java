package courseWork2.app;


    public abstract class Item implements Run{
        private String itemText;

        public Item(String itemText) {
            this.itemText = itemText;
        }

        public String getItemText() {
            return itemText;

    }
}
