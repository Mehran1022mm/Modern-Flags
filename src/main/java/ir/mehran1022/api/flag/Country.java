package ir.mehran1022.api.flag;

import ir.mehran1022.api.flag.implementation.asia.western.*;
import ir.mehran1022.api.flag.implementation.organizations.EuropeanUnionFlag;
import ir.mehran1022.api.flag.implementation.america.north.*;
import ir.mehran1022.api.flag.implementation.america.south.*;
import ir.mehran1022.api.flag.implementation.europe.balkan.*;
import ir.mehran1022.api.flag.implementation.europe.baltic.*;
import ir.mehran1022.api.flag.implementation.europe.central.*;
import ir.mehran1022.api.flag.implementation.europe.eastern.*;
import ir.mehran1022.api.flag.implementation.europe.western.*;
import ir.mehran1022.api.flag.implementation.europe.scandinavian.*;

import ir.mehran1022.flags.util.Logger;
import lombok.Getter;

public enum Country {

    ALBANIA("Albania", AlbanianFlag.class),
    ARMENIA("Armenia", ArmenianFlag.class),
    ARGENTINA("Argentina", ArgentinianFlag.class),
    AUSTRIA("Austria", AustrianFlag.class),
    BRAZIL("Brazil", BrazilianFlag.class),
    BOLIVIA("Bolivia", BolivianFlag.class),
    BELARUS("Belarus", BelarusianFlag.class),
    BELGIUM("Belgium", BelgianFlag.class),
    BOSNIA("Bosnia", BosnianFlag.class),
    BULGARIA("Bulgaria", BulgarianFlag.class),
    CANADA("Canada", CanadianFlag.class),
    CHILE("Chile", ChileanFlag.class),
    CROATIA("Croatia", CroatianFlag.class),
    CYPRUS("Cyprus", CyprusFlag.class),
    COLUMBIA("Columbia", ColumbianFlag.class),
    CZECH("Czech Republic", CzechFlag.class),
    DENMARK("Denmark", DanishFlag.class),
    ESTONIA("Estonia", EstonianFlag.class),
    EUROPEAN_UNION("European Union", EuropeanUnionFlag.class),
    FINLAND("Finland", FinnishFlag.class),
    FRANCE("France", FrenchFlag.class),
    GERMANY("Germany", GermanFlag.class),
    GEORGIA("Georgia", GeorgianFlag.class),
    GREENLAND("Greenland", GreenlandFlag.class),
    GREECE("Greece", GreekFlag.class),
    HUNGARY("Hungary", HungarianFlag.class),
    IRAN("Iran", IranianFlag.class),
    ICELAND("Iceland", IcelandFlag.class),
    IRELAND("Ireland", IrishFlag.class),
    ITALY("Italy", ItalianFlag.class),
    ISRAEL("Israel", IsraeliFlag.class),
    IRAQ("Iraq", IraqiFlag.class),
    LATVIA("Latvia", LatvianFlag.class),
    LIECHTENSTEIN("Liechtenstein", LiechtensteinFlag.class),
    LITHUANIA("Lithuania", LithuanianFlag.class),
    LEBANON("Lebanon", LebaneseFlag.class),
    MEXICO("Mexico", MexicanFlag.class),
    MACEDONIA("Macedonia", MacedonianFlag.class),
    MONTENEGRO("Montenegro", MontenegroFlag.class),
    NETHERLANDS("Netherlands", DutchFlag.class),
    NORWAY("Norway", NorwegianFlag.class),
    OMAN("Oman", OmaniFlag.class),
    POLAND("Poland", PolishFlag.class),
    PORTUGAL("Portugal", PortugueseFlag.class),
    PERU("Peru", PeruvianFlag.class),
    PALESTINE("Palestine", PalestinianFlag.class),
    ROMANIA("Romania", RomanianFlag.class),
    RUSSIA("Russia", RussianFlag.class),
    SERBIA("Serbia", SerbFlag.class),
    SLOVAKIA("Slovakia", SlovakFlag.class),
    SLOVENIA("Slovenia", SlovenianFlag.class),
    SPAIN("Spain", SpanishFlag.class),
    SWEDEN("Sweden", SwedishFlag.class),
    SWITZERLAND("Switzerland", SwissFlag.class),
    SAUDI_ARABIA("Saudi Arabia", ArabianFlag.class),
    SYRIA("Syria", SyrianFlag.class),
    TURKEY("Turkey", TurkishFlag.class),
    UKRAINE("Ukraine", UkrainianFlag.class),
    UNITED_KINGDOM("United Kingdom", BritishFlag.class),
    UNITED_STATES("United States", UnitedStatesFlag.class),
    UNITED_ARAB_EMIRATES("United Arab Emirates", ArabEmiratesFlag.class),
    KOSOVO("Kosovo", KosovanFlag.class),
    YEMEN("Yemen", YemeneseFlag.class),
    VENEZUELA("Venezuela", VenezuelanFlag.class);

    @Getter
    private final String name;
    private final Class<? extends Flag> flagClass;

    Country(String name, Class<? extends Flag> flagClass) {
        this.name = name;
        this.flagClass = flagClass;
    }

    public Flag createInstance() {
        try {
            return flagClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            Logger.error(String.format("Could not create flag instance for: %s", name), e);
            return null;
        }
    }
}