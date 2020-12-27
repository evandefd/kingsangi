# kingsangi

### 환율 계산기
네트워크로 환율 정보를 받아와 환율 정보 및 환율 계산을 수행할 수 있다.  
Retrofit2 라이브러리를 사용한다.

#### Usage
##### Basic content
환율 계산기는 다음 프로세스로 동작한다.
1. 기준 통화의 환율을 네트워크로 가져옴(기준 통화 : 변환의 기준이 되는 통화, e.g. USD -> KRW의 경우 USD가 기준 통화)
2. 변환 대상 통화를 지정해 환율을 가져오거나 계산할 수 있다.
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
3. Callback<Exchange> 콜백 메소드를 사용하여 데이터를 가져온다.
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
  
