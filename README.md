# PoC Docker Railway Stack

## Previo
- Instalar Docker
- Instalar Docker Compose
- Instalar jq (Opcional)

## Ejecutar
``docker compose up -d --build db api``
- ``curl http://localhost:8080/api/restaurants | jq`` (con jq)
- ``curl http://localhost:8080/api/restaurants`` (sin jq)


## Pendiente
- Desplegar testing y producción en nube
- Consumir API desde frontend
- Hacer que la carga de datos dummy en la db funcione con Flyway (no logré hacerlo andar)