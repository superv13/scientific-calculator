#!/bin/bash

echo "Deploying application using Ansible..."
ansible-playbook ansible/deploy.yml -i ansible/inventory.ini

echo "Opening calculator..."
docker exec -it scientific-calculator java -jar app.jar