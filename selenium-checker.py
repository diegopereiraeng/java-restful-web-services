from selenium import webdriver
import sys
""" import logging

from selenium.webdriver.common.desired_capabilities import DesiredCapabilities
d = DesiredCapabilities.CHROME
d['loggingPrefs'] = {'performance': 'ALL'}
 """

url = sys.argv[1]

print("Starting Selenium Test for URL: "+url)

#  ChromeOptions
chrome_options = webdriver.ChromeOptions()
chrome_options.add_argument('--headless')
chrome_options.add_argument('--no-sandbox') # required when running as root user. otherwise you would get no sandbox errors.
driver = webdriver.Chrome(options=chrome_options)

Calls = 1000

for call in range(Calls):
    driver.get(url)
    print("Success - Selenium Test number "+call+" for URL: "+url)
    url_service = url + "/api/v1/resume"
    print("Starting Selenium Test number "+call+" for URL: "+url_service)
    driver.get(url_service)
    print("Success - Selenium Test number "+call+" for URL: "+url)
    url_service = url + "/api/v1/harness"
    print("Starting Selenium Test number "+call+" for URL: "+url_service)
    driver.get(url_service)
    print("Success - Selenium Test number "+call+" for URL: "+url)
""" print(driver.title)
"""

print("Selenium Test Finished")