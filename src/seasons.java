public class seasons {
    public enum Seasons {
        Весна(10),
        Лето(25),
        Осень(10),
        Зима(-10);

        private int averageTemperature;

        Seasons(int averageTemperature) {
            this.averageTemperature = averageTemperature;
        }

        public int getAverageTemperature() {
            return averageTemperature;
        }

        public String getDescription() {
            return "Холодное время года";
        }

        public String getDescription(Seasons season) {
            switch (season) {
                case Лето:
                    return "Теплое время года";
                default:
                    return getDescription();
            }
        }
    }
}
