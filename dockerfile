FROM centos:7


MAINTAINER "Björn Dieding" <bjoern@xrow.de>
ENV container docker
MAINTAINER The CentOS Project <cloud-ops@centos.org>


RUN yum -y swap -- remove systemd-container systemd-container-libs -- install systemd systemd-libs
RUN yum -y update; yum -y install openssh-server vim tcpdump net-tools bind-tools
RUN (cd /lib/systemd/system/sysinit.target.wants/; for i in *; do [ $i == systemd-tmpfiles-setup.service ] || rm -f $i; done); \
rm -f /lib/systemd/system/multi-user.target.wants/*;\
rm -f /etc/systemd/system/*.wants/*;\