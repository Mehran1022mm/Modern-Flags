package ir.mehran1022.api.flag;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
public enum Continent {

    ORGANIZATIONS("Organizations", List.of(
            Country.EUROPEAN_UNION
    )),
    ASIA("Asia", List.of(
            Country.IRAN, Country.SAUDI_ARABIA, Country.OMAN, Country.SYRIA, Country.PALESTINE, Country.ISRAEL, Country.IRAQ, Country.YEMEN, Country.LEBANON, Country.UNITED_ARAB_EMIRATES
    )),
    EUROPE("Europe", List.of(
            Country.ALBANIA, Country.AUSTRIA, Country.BELARUS, Country.BELGIUM, Country.BULGARIA,
            Country.CROATIA, Country.DENMARK, Country.FINLAND, Country.FRANCE, Country.GERMANY,
            Country.GREECE, Country.HUNGARY, Country.ICELAND, Country.ITALY, Country.IRELAND,
            Country.NETHERLANDS, Country.NORWAY, Country.POLAND, Country.PORTUGAL, Country.ROMANIA,
            Country.SPAIN, Country.SWEDEN, Country.SWITZERLAND, Country.UNITED_KINGDOM,  Country.UKRAINE,
            Country.KOSOVO, Country.BOSNIA, Country.MACEDONIA, Country.MONTENEGRO, Country.CYPRUS,
            Country.GEORGIA, Country.LIECHTENSTEIN, Country.LATVIA, Country.LITHUANIA, Country.SLOVAKIA,
            Country.SLOVENIA, Country.ESTONIA, Country.SERBIA, Country.RUSSIA, Country.ARMENIA,
            Country.TURKEY
    )),
    AMERICA("America", List.of(
            Country.CANADA, Country.GREENLAND, Country.MEXICO, Country.UNITED_STATES, Country.ARGENTINA, Country.CHILE, Country.BRAZIL, Country.BOLIVIA, Country.PERU, Country.VENEZUELA, Country.COLUMBIA
    ));

    private final String name;
    private final List<Country> countries;

    Continent(String name, List<Country> countries) {
        this.name = name;
        this.countries = countries;
    }

    public static Continent getByName(String name) {
        return Arrays.stream(values())
                .filter(c -> c.name.equalsIgnoreCase(name))
                .findFirst().orElse(null);
    }
}
