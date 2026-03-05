#!/bin/bash

echo "Deploying using Ansible..."
ansible-playbook -i inventory.ini deploy.yml

echo "Attaching to running container..."
docker exec -it scientific-calculator java -jar app.jar