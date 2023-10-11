    public class Main {
        public static void main(String[] args) {
            seasons.Seasons favoriteSeason = seasons.Seasons.Лето;
            System.out.println("Мое любимое время года: " + favoriteSeason);
            System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature());
            System.out.println("Описание времени года: " + favoriteSeason.getDescription());

            for (seasons.Seasons season : seasons.Seasons.values()) {
                System.out.println(season + " - " + season.getAverageTemperature() + " градусов, " + season.getDescription(season));
            }
        }
    }

