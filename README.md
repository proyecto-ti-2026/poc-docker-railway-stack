# PoC Docker Railway Stack

## Previo
- Instalar Docker
- Instalar Docker Compose
- Instalar jq (Opcional)
- ``curl http://localhost:8080/api/restaurants | jq`` (con jq)
- ``curl http://localhost:8080/api/restaurants`` (sin jq)

## Ejecutar
``docker compose up -d --build db api``


## Pendiente
- Consumir API desde frontend
- Hacer que la carga de datos dummy en la db funcione con Flyway (no logré hacerlo andar)