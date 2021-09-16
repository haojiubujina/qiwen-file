/**
 *
 * (c) Copyright Ascensio System SIA 2021
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.qiwenshare.file.helper;

import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.Properties;
@Component
public class ConfigManager
{
    private static Properties properties;

    static
    {
        Init();
    }

    private static void Init()
    {
        try
        {
            properties = new Properties();
            InputStream stream = ConfigManager.class.getResourceAsStream("/config/settings.properties");
//            InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream("settings.properties");
            properties.load(stream);
        }
        catch (Exception ex)
        {
            properties = null;
        }
    }

    public static String GetProperty(String name)
    {
        if (properties == null)
        {
            return "";
        }

        String property = properties.getProperty(name);

        return property == null ? "" : property;
    }
}