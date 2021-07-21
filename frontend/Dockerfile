FROM node:10 as builder
WORKDIR /app
COPY ./package.json ./
RUN npm install --silent
RUN npm install react-scripts@3.0.1 -g --silent
COPY . .
RUN npm run build

FROM nginx
EXPOSE 3000 
COPY ./nginx/default.conf /etc/nginx/conf.d/default.conf
COPY --from=builder /app/build  /usr/share/nginx/html