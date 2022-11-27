package channels;

import database.DatabaseManager;

public class Provider {
        private String providerName;
        private String basePlan;
        private String addOns;
        private String allChannels;

        public Provider(String providerName, String basePlan, String addOns) {
            this.providerName = providerName;
            this.basePlan = basePlan;
            this.addOns = addOns;
            //allChannels = getChannels();
        }
        public String getChannels() {
            String channels = "";
            DatabaseManager db = new DatabaseManager();
            db.openConnection();
            //db.getRestaurantsWithMatchingZip(zip, db);
            if(providerName.equals("Atlice")){}
            else if(providerName.equals("Armstrong")){}
            else if(providerName.equals("Atlantic Broadband")){}
            else if(providerName.equals("At&T U-verse")){}
            else if(providerName.equals("Blue Ridge Cable")){}
            else if(providerName.equals("CableAmerica")){}
            else if(providerName.equals("CenturyLink Prism TV")){}
            else if(providerName.equals("Charter Communications")){}
            else if(providerName.equals("Cincinnati Bell")){}
            else if(providerName.equals("Comcast Xfinity TV")){}
            else if(providerName.equals("Comporium")){}
            else if(providerName.equals("Cox Communications")){}
            else if(providerName.equals("DirecTV")){}
            else if(providerName.equals("Dish Network")){}
            else if(providerName.equals("Eagle Communications")){}
            else if(providerName.equals("Frankfort Plant Board Cable")){}
            else if(providerName.equals("Frontier Communications")){}
            else if(providerName.equals("GCI")){}
            else if(providerName.equals("Google Fiber")){}
            else if(providerName.equals("Grande")){}
            else if(providerName.equals("Massillon Cable")){}
            else if(providerName.equals("Mid-Hudson Cable")){}
            else if(providerName.equals("NewWave Communications")){}
            else if(providerName.equals("OneLink")){}
            else if(providerName.equals("Optimum by Atlice")){}
            else if(providerName.equals("San Juan Cable")){}
            else if(providerName.equals("Service Electric Cable TV")){}
            else if(providerName.equals("Service Electric Cablevision")){}
            else if(providerName.equals("Service Electric Broadband Cable")){}
            else if(providerName.equals("Spectrum")){}
            else if(providerName.equals("SuddenLink by Atlice")){}
            else if(providerName.equals("SureWest")){}
            else if(providerName.equals("Time Warner Cable")){}
            else if(providerName.equals("Verizon FiOS TV")){}
            else if(providerName.equals("Wave Broadband")){}
            else if(providerName.equals("WEHCO video")){}
            else if(providerName.equals("WOW!")){}
            else if(providerName.equals("DirecTV Stream")){}
            else if(providerName.equals("Fubo TV")){}
            else if(providerName.equals("Hulu Plus Live TV")){}
            else if(providerName.equals("Philo")){}
            else if(providerName.equals("Sling TV")){}
            else if(providerName.equals("YouTube TV")){
                if(basePlan.equals("Base Plan") || basePlan.equals("basePlan")){
                    allChannels = "KCAL 9, ABC 7, CBS 2, FOX 11, NBC 4, PBS SoCal, KCET, KLCS, ESPN, QVC, HSN, TBS," +
                            " TNT, CNN, Cartoon Network, FS1, Telemundo 52, USA, ACC NEtwork, FX, Freeform, NBATV, " +
                            "MLB Network, ESPN2, ESPNU, Tastemade, FS2, Disney Channel, E!, Bravo, NFL Network, Oxygen True Crime, " +
                            "MLB Game of the Week, HLN, BTN, SEC Network, ESPNews, CBS Sports Network, FXX, Cheddar News, SYFY, " +
                            "Disney Junior, Disney XD, PBS SoCal Kids, MSNBC, Nickelodeon, Nick Jr., Nicktoons, TeenNick, FOX News, " +
                            "AMC, CNBC, BET, BET Her, CMT, Comedy.TV, FOX Business, FOX SOUL, Nat Geo, FXM, Comedy Central, TYT Network, " +
                            "Universal Kids, Hallmark Channel, Hallmark Drama, Hallmark Movies & Mysteries, IFC, MTV, MTV2, MTV Classic, VH1, " +
                            "Paramount, Sundance TV, Nat Geo Wild, Golf Channel, NewsNation, Animal Planet, Discovery Channel, " +
                            "Travel Channel, TV Land, Court TV, Dabl, Food Network, HGTV, JusticeCentral.TV, ID, MotorTrend, OWN, Recipe.TV, " +
                            "TLC, Game Show Network, WE tv, ABC News Live, BBC America, BBC World News, FOX Weather, LiveNOW from Fox, Localish, " +
                            "KRCA Estrella, Local Now, truTV, Turner Classic Movies, NBC News NOW, NBCLX, The Weather Channel, KMEX, KFTR, Galavision, " +
                            "TUDN, Cozi, getTV, Smithsonian Channel, Pop, Start TV, Comet TV, My13, ";
                }
                else {
                    // basePlan == Spanish Plan
                }
                if(addOns.contains("sportsPlus")){
                    allChannels += "NFL RedZone, beIN Sports, beIN SPORTS XTRA, FOX Soccer Plus, VSiN, Outside TV+, " +
                            "PokerGO+, MavTV, FanDuel TV, FanDuel Racing, Stadium, Stadium Overflow 1, Stadium Overflow 2, " +
                            "Stadium Overflow 3, Billiard TV, SportsGrid, PlayersTV, Fight Network, IMPACT Wrestling Channel";
                }
                if(addOns.contains("nbaLeaguePass")){
                    allChannels += "NBA League Pass, ";
                }
                if(addOns.contains("mlbTV")){
                    allChannels += "MLB TV, MLB Big Inning";
                }
            }
            else{
                    // provider entered does not exist
            }
            return allChannels;
        }
    }


