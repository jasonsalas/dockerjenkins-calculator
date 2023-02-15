# dockerjenkins-calculator
Porting examples for [Continuous Delivery with Docker and Jenkins, 3rd Ed.](https://www.amazon.com/Continuous-Delivery-Docker-Jenkins-applications/dp/1803237481/) by [Rafal Leszko](https://github.com/leszko) to WSL

### Motivation
Rafal's book is a wonderful tour through the process of constructing and managing effective CI/CD pipelines primarily with Docker, Jenkins, Kubernetes, Ansible and Terraform. The main service is a Java application - a simple calculator.

While the book is written for a development environment in which Docker runs natively in Linux, I'm attempting to [port the samples to work in Windows Subsystem for Linux](https://learn.microsoft.com/en-us/windows/wsl/install). Rafal [has noted](https://github.com/PacktPublishing/Continuous-Delivery-With-Docker-and-Jenkins-3rd-Edition/issues/1) the tools tend to run differently when invoked through virtualized environments.