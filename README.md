# kingsangi

### 환율 계산기
네트워크로 환율 정보를 받아와 환율 정보 및 환율 계산을 수행할 수 있다.  
Retrofit2 라이브러리를 사용한다.

https://exchangeratesapi.io/ 의 API를 사용하여 환율 데이터를 사용한다. 위 API는 Euporian Central Bank에서 환율 데이터를 수집한다.

#### Supported currency
> Use Ctrl + F to faster searching
- CAD : Canadian dollar(🇨🇦 Canada)
- HKD : Hong Kong dollar(🇭🇰 Hong Kong)
- ISK : Icelandic króna(🇮🇸 Iceland)
- PHP : Philippine peso(🇵🇭 Philippine)
- DKK : Danish krone(🇩🇰 Denmark, 🇫🇴 Faroe Islands, 🇬🇱 Greenland)
- HUF : Hungarian forint(🇭🇺 Hungary)
- CZK : Czech koruna(🇨🇿 Czechia)
- AUD : Australian dollar(🇦🇺 Australia, 🇨🇽 Christmas Island, 🇨🇨 Cocos (Keeling) Islands, 🇭🇲 Heard Island and McDonald Islands, 🇰🇮 Kiribati, 🇳🇷 Nauru, 🇳🇫 Norfolk Island, 🇹🇻 Tuvalu)
- RON : Romanian leu(🇷🇴 Romania)
- SEK : Swedish krona/kronor(🇸🇪 Sweden)
- IDR : Indonesian rupiah(🇮🇩 Indonesia)
- INR : Indian rupee(🇮🇳 India, 🇧🇹 Bhutan)
- BRL : Brazilian real(🇧🇷 Brazil)
- RUB : Russian ruble(🇷🇺 Russia)
- HRK : Croatian kuna(🇭🇷 Croatia)
- JPY : Japanese yen(🇯🇵 Japan)
- THB : Thai baht(🇹🇭 Thailand)
- CHF : Swiss franc(🇨🇭 Switzerland, 🇱🇮 Liechtenstein)
- SGD : Singapore dollar(🇸🇬 Singapore)
- PLN : Polish złoty(🇵🇱 Poland)
- BGN : Bulgarian lev(🇧🇬 Bulgaria)
- TRY : Turkish lira(🇹🇷 Turkey)
- CNY : Chinese yuan(🇨🇳 China)
- NOK : Norwegian krone(🇳🇴 Norway, 🇸🇯 Svalbard and  Jan Mayen, 🇧🇻 Bouvet Island)
- NZD : New Zealand dollar(🇳🇿 New Zealand, 🇨🇰 Cook Islands, 🇳🇺 Niue, 🇵🇳 Pitcairn Islands (see also Pitcairn Islands dollar), 🇹🇰 Tokelau)
- ZAR : South African rand(🇱🇸 Lesotho, 🇳🇦 Namibia, 🇿🇦 South Africa)
- USD : United States dollar(🇺🇸 United States, 🇦🇸 American Samoa, 🇮🇴 British Indian Ocean Territory (also uses GBP), 🇻🇬 British Virgin Islands, 🇧🇶 Caribbean Netherlands (Bonaire, Sint Eustatius and Saba), 🇪🇨 Ecuador, 🇸🇻 El Salvador, 🇬🇺 Guam, 🇭🇹 Haiti, 🇲🇭 Marshall Islands, 🇫🇲 Federated States of Micronesia, 🇲🇵 Northern Mariana Islands, 🇵🇼 Palau, 🇵🇦 Panama (as well as Panamanian Balboa), 🇵🇷 Puerto Rico, 🇹🇱 Timor-Leste, 🇹🇨 Turks and Caicos Islands, 🇻🇮 U.S. Virgin Islands, 🇺🇲 United States Minor Outlying Islands)
- MXN : Mexican peso(🇲🇽 Mexico)
- ISL : Israeli new shekel(🇮🇱 Israel)
- GBP : Pound sterling(🇬🇧 United Kingdom)
- KRW : South Korean won(🇰🇷 South Korea)
- MYR : Malaysian ringgit(🇲🇾 Malaysia)
- EUR : Euro(🇦🇽 Åland Islands, 🇪🇺 European Union, 🇦🇩 Andorra, 🇦🇹 Austria, 🇧🇪 Belgium, 🇨🇾 Cyprus, 🇪🇪 Estonia, 🇫🇮 Finland, 🇫🇷 France, 🇹🇫 French Southern and Antarctic Lands, 🇩🇪 Germany, 🇬🇷 Greece, 🇬🇵 Guadeloupe, 🇮🇪 Ireland, 🇮🇹 Italy, 🇱🇻 Latvia, 🇱🇹 Lithuania, 🇱🇺 Luxembourg, 🇲🇹 Malta, 🇬🇫 French Guiana, 🇲🇶 Martinique, 🇾🇹 Mayotte, 🇲🇨 Monaco, 🇲🇪 Montenegro, 🇳🇱 Netherlands, 🇵🇹 Portugal, 🇷🇪 Réunion, 🇧🇱 Saint Barthélemy, 🇲🇫 Saint Martin, 🇵🇲 Saint Pierre and Miquelon, 🇸🇲 San Marino, 🇸🇰 Slovakia, 🇸🇮 Slovenia, 🇪🇸 Spain, 🇻🇦 Vatican City)

#### Usage
##### Basic content
환율 계산기는 다음 프로세스로 동작한다.
1. 기준 통화의 환율을 네트워크로 가져옴(기준 통화 : 변환의 기준이 되는 통화, e.g. USD -> KRW의 경우 USD가 기준 통화)
2. 변환 대상 통화를 지정해 환율을 가져오거나 계산할 수 있다.
##### Currency enumeration
ISO 4217 규격에 따라 정의된 통화 코드(영문 3글자)를 사용한다.
e.g. Currency.USD, Currency.KRW, Currency.HKD ...
##### Getting Exchange instance
기준 통화의 환율을 가져오려면 다음 코드를 사용한다.
1. ExchangeFactory 객체를 가져온다.
  ```
  //Get exchange factory instance that used to get Exchange object.
  ExchangeFactory exchangeFactory = ExchangeAPIClient.getExchangeFactory();
  ```
2. ExchangeFactory 내의 적절한 메소드를 사용하여 Exchange 객체를 가져온다.
  ```
  Call<Exchange> exchangeCall = exchangeFactory.getLatestExchange(Currency.USD.name());
  ```
  - 해당 객체는 Retrofit2에서 제공하는 Call<Exchange> 타입이며 콜백 함수를 사용하여 성공 실패 여부를 확인할 수 있다.
3. Callback<Exchange> 콜백 메소드를 사용하여 Exchange 객체를 가져온다.
  ```
  exchangeCall.enqueue(new Callback<>() {
            @Override
            public void onResponse(Call<Exchange> call, Response<Exchange> response) {
                Exchange exchange = response.body();
                //response can be null
  
                //Do something on response
            }

            @Override
            public void onFailure(Call<Exchange> call, Throwable t) {
                //Failed to get Exchange response
                
                //Do something on failed
            }
        });
  ```
  
##### Get exchange rate and convert current unit with Exchange object
Exchange 객체를 사용하여 환율을 구하거나 계산하는 방법은 다음과 같다.
1. 기준 통화 가져오기
  ```
  exchange.getBaseCurrency();
  ```
  
2. 대상 통화의 환율(기준 통화를 대상 통화로 변환하기 위한 비율) 가져오기
  ```
  exchange.getExchangeRate(Currency.KRW);
  ```
  
3. 환전하기
  ```
  exchange.convertWithExchangeRate(10, Currency.KRW); //e/g. 10 USD to KRW
  ```
  
