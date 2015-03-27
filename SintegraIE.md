# Introdução #

A biblioteca SintegraIE foi criada para facilitar a validação das Inscrições Estaduais em Java.

Como cada estado possui um cálculo diferente na validação foi utilizado as informações que constam no site do Sintegra http://www.sintegra.gov.br/


# Detalhes do Uso #

Para utilização a biblioteca siga o exemplo abaixo

```
InscricaoEstadual ie = InscricaoEstadualFactory.getInstance("TO");
boolean valido = ie.validar("2901022783-6");
```