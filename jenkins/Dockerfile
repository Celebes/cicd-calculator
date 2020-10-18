FROM jenkins/jenkins
USER root
RUN apt-get update && \
	apt-get -y install sudo && \
	curl -sfL -o docker.tgz "https://download.docker.com/linux/static/stable/x86_64/docker-19.03.13.tgz" && \
	tar -xzf docker.tgz --directory /usr/local/bin && \
	rm docker.tgz && \
	groupadd docker && \
	usermod -aG docker jenkins && \
	newgrp docker
ENV PATH="${PATH}:/usr/local/bin/docker"
USER jenkins