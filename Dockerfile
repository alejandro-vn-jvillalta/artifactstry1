# Usa la imagen base de Nginx
FROM nginx:alpine

# Copia archivos de configuración
COPY ./html /usr/share/nginx/html

# Exponer el puerto en el que Nginx está escuchando
EXPOSE 80
