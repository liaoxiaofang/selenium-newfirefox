#基础镜像
FROM redis:v1.1


#修改时区时间
RUN cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime


# Expose ports.
EXPOSE 6379


#START CMD
CMD [ "redis-server", "/usr/local/etc/redis/redis.conf" ]